package edu.csupomona.cs585.stub;

public class Collaborator {
	public Task getTask() {
        return new Task();
    }

    class Task {
        public boolean isActive() {
            return Math.random() < 0.5;
        }
    }
}
