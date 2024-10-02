package com.idsit2024.springboot.service;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import com.idsit2024.springboot.controller.HelloController;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Service;
import com.idsit2024.springboot.modele.Module; // Ajustez le chemin du package selon votre organisation

//suite import
@Service
public class ModuleService {
    private List<Module> modules=
            new ArrayList<>(Arrays.asList(new Module(10 ,"Java SE", "Description de la plateforme Java SE"),
                    new Module (12, "Java EE", "Description de la plateforme Java EE")));
    public List<Module> getModules() {
        return modules;
    }
    public Module getModule(Integer id) {
        for (Module module : modules) {
            if (id.equals(module.getId())) {
                return module;
            }
        }
        return null;
    }
    public void ajouterModule(Module module) {
        modules.add(module);
    }
    public void modifierModule(Integer id, Module module) {
        for (int i=0; i<modules.size(); i++) {
            Module m = modules.get(i);
            if (id.equals(m.getId())) {
                modules.set(i, module);
                return;
            }
        }
    }
    public void supprimerModule(Integer id) {
        modules.removeIf(m -> id.equals(m.getId()));
    }
}