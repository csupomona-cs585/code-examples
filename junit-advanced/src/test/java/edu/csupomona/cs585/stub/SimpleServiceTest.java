package edu.csupomona.cs585.stub;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import edu.csupomona.cs585.stub.Collaborator.Task;

public class SimpleServiceTest {

	@Test
	public void testIsActive() {
		SimpleService simpleService = new SimpleService();

		Task mockTask = Mockito.mock(Task.class);
		when(mockTask.isActive()).thenAnswer(new Answer<Boolean>() {
			public Boolean answer(InvocationOnMock invocation) throws Throwable {
				System.out.println("Executed!");
				return Math.random() < 0.3;
			}
		});

		Collaborator mockCollaborator =
				Mockito.mock(Collaborator.class);
		when(mockCollaborator.getTask()).thenReturn(mockTask);

		simpleService.setCollaborator(mockCollaborator);
		Assert.assertTrue(simpleService.isActive());

		//verify(mockTask, times(2)).isActive();
	}
}
