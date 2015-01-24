package edu.csupomona.cs585.stub;

public class SimpleService {

	private Collaborator collaborator;

    public void setCollaborator(Collaborator c) {
        this.collaborator = c;
    }

    public boolean isActive() {
        return collaborator.getTask().isActive();
    }
}
