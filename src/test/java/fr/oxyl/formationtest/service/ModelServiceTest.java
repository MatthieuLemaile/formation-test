package fr.oxyl.formationtest.service;

import fr.oxyl.formationtest.dao.ModelDao;
import fr.oxyl.formationtest.model.Model;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ModelServiceTest {

    @Mock
    private ModelDao modelDao;

    @InjectMocks
    private ModelService modelService;

    @Test
    void get_Model_should_return_db_model() throws SQLException {
        // GIVEN
        String uuid = "myCustomUuid";
        Model model = new Model();
        model.setUuid(uuid);
        Mockito.when(modelDao.getModel(uuid)).thenReturn(model);

        // WHEN
        Model resultingModel = modelService.getModel(uuid);

        // THEN
        assertEquals(model, resultingModel);
        Mockito.verify(modelDao).getModel(uuid);
    }

    @Test
    void get_Model_db_error_should_return_db_model() throws SQLException {
        // GIVEN
        String uuid = "myCutomUuid";
        Model model = new Model();
        model.setUuid(uuid);
        String sqlExceptionMessage = "DB ERROR";
        Mockito.when(modelDao.getModel(uuid)).thenThrow(new SQLException(sqlExceptionMessage));

        // WHEN
        String message = assertThrows(SQLException.class, () -> modelService.getModel(uuid))
                .getMessage();

        // THEN
        assertEquals(sqlExceptionMessage, message);
        Mockito.verify(modelDao).getModel(uuid);
    }

    // Écrire un (ou +eurs) test qui vérifie le comportement de getModelByName
    // Écrire un (ou +eurs) test qui vérifie le comportement de saveModel
    // Écrire un (ou +eurs) test qui vérifie le comportement de getAllModel
    // Écrire un (ou +eurs) test qui vérifie le comportement de addScoreOfModels

}