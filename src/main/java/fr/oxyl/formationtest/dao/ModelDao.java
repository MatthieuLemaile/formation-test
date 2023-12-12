package fr.oxyl.formationtest.dao;

import fr.oxyl.formationtest.model.Model;

import java.sql.SQLException;
import java.util.List;

public interface ModelDao {

    Model getModel(String uuid) throws SQLException;
    Model getModelMatchingName(String name) throws SQLException;
    Model saveModel(Model model) throws SQLException;
    List<Model> getAllModel() throws SQLException;
}
