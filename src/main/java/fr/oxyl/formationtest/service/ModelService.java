package fr.oxyl.formationtest.service;

import fr.oxyl.formationtest.dao.ModelDao;
import fr.oxyl.formationtest.model.Model;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class ModelService {

    public ModelService(ModelDao dao) {
        this.dao = dao;
    }

    private final ModelDao dao;

    public Model getModel(String uuid) throws SQLException {
        return this.dao.getModel(uuid);
    }

    public Model getModelByName(String name) throws SQLException {
        return this.dao.getModelMatchingName(name);
    }

    public void saveModel(Model model) throws SQLException {
        this.dao.saveModel(model);
    }

    public List<Model> getAllModel() throws SQLException {
        return this.dao.getAllModel();
    }

    public int addScoreOfModels(String uuid1, String uuid2) throws SQLException {
        Model model1 = this.dao.getModel(uuid1);
        Model model2 = this.dao.getModel(uuid2);
        return model1.getScore() + model2.getScore();
    }
}
