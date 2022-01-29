package collectionsautoboxing;

import java.util.HashMap;
import java.util.Map;

public class Vote {

    public Map<VoteResult, Integer> getResult(Map<String, VoteResult> votes) {
        Map<VoteResult, Integer> vote = new HashMap<>();
        for (VoteResult v : VoteResult.values()) {
            vote.put(v, 0);
        }

        for (VoteResult v : votes.values()) {
            vote.put(v, vote.get(v)+1);
        }
        return vote;
    }
}
