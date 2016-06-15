package dhbw.teamgold.engine.core.services;

import java.util.LinkedList;
import java.util.Queue;

import dhbw.teamgold.engine.service.Provider;

public class SceneHistoryServiceProvider implements Provider<SceneHistoryService> {

	@Override
	public SceneHistoryService createService() {
		return new SceneHistoryServiceImpl();
	}

	@Override
	public Class<SceneHistoryService> getType() {
		return SceneHistoryService.class;
	}
	
	private static class SceneHistoryServiceImpl implements SceneHistoryService {

		private Queue<Integer> history = new LinkedList<>();
		private Integer currentId = null;
		
		@Override
		public int popLastSceneId() {
			return history.poll();
		}

		@Override
		public void pushSceneId(int id) {
			if (currentId != null) {
				history.add(currentId);
			}
			currentId = id;
		}
	}
}
