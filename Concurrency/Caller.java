package Concurrency;

import org.jetbrains.annotations.NotNull;

import java.util.concurrent.Executor;

public class Caller implements Executor {
    @Override
    public void execute(@NotNull Runnable runnable) {
        runnable.run();
    }
}
