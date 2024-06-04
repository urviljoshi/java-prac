package com.example.jp.j19;

import java.time.Duration;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.StructuredTaskScope;

public class StructuredConcurrency {

    public static void main(String[] args) {

    }

    Resp handleUnStructureAPI() throws ExecutionException, InterruptedException {
        try (var scope = new StructuredTaskScope.ShutdownOnFailure()) {
            StructuredTaskScope.Subtask<String> user = scope.fork(this::findUser);
            StructuredTaskScope.Subtask<Integer> order =scope.fork(this::fetchOrder);
            scope.join();
            scope.throwIfFailed();
            return new Resp( order.get(),user.get());
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    private String findUser() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(1));
        return "mkyong";
    }

    private Integer fetchOrder() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(1));
        return 1;
    }


    record Resp(int x, String y){

    }
}
