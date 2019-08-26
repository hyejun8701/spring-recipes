package com.apress.springrecipes.sequence.repository;

import com.apress.springrecipes.sequence.domain.Sequence;

public interface SequenceDao {
    public Sequence getSequence(String sequenceId);
    public int getNextValue(String sequenceId);
}
