package com.github.martials.expressions;

import com.github.martials.utils.ExpressionUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TruthTableTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void helperMatrix() {
        Assertions.fail();
    }

    @Test
    void create() {
        Assertions.fail();
    }

    @Test
    void testToString() {
        System.out.println(new TruthTable(new ExpressionUtils("A ⋁ B ➔ ¬C", false).simplify().toSetArray()));
    }
}