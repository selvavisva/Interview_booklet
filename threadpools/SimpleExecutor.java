package com.depth.threadpools;

import java.util.concurrent.Executor;

public class SimpleExecutor implements Executor{

	public void execute(Runnable task) {
		new Thread(task).start();
	}
}
