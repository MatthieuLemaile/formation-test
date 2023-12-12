package fr.oxyl.formationtest.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ComputeTest {

    private final Compute compute = new Compute();

    @Test
    void when_add_2_and_3_should_give_5() {
        Assertions.assertEquals(5, compute.add2Numbers(2,3));
    }

    @Test
    void when_substract_2_from_3_should_give_1() {
        Assertions.fail();
    }

    // Écrire un test qui vérifie le comportement de multiply2Numbers(2,3)
    // Écrire un test qui vérifie le comportement de isGreaterThan(19,7)
    // Écrire un test qui vérifie le comportement de isGreaterThan(19,19)
    // Écrire un test qui vérifie le comportement de divide2Numbers(3,0)
}