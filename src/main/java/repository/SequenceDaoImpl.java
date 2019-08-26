package repository;

import domain.Sequence;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Component("sequenceDao")
public class SequenceDaoImpl implements SequenceDao {
    private final Map<String, Sequence> sequences = new HashMap<String, Sequence>();
    private final Map<String, AtomicInteger> values = new HashMap<String, AtomicInteger>();

    public SequenceDaoImpl() {
        sequences.put("IT", new Sequence("IT", "30", "A"));
        values.put("IT", new AtomicInteger(10000));
    }

    @Override
    public Sequence getSequence(String sequenceId) {
        return sequences.get(sequenceId);
    }

    @Override
    public int getNextValue(String sequenceId) {
        AtomicInteger value = new AtomicInteger();
        return value.getAndIncrement();
    }
}
