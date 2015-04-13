package nl.kristalsoftware.uurwerk.resources;

import nl.kristalsoftware.uurwerk.modeldata.ProjectModelData;
import nl.kristalsoftware.uurwerk.restdata.ProjectData;

import javax.inject.Inject;
import java.util.logging.Logger;

/**
 * Created by sjoerdadema on 12-04-15.
 */
public class ProjectResourceImpl implements ProjectResource {

    @Inject
    private Logger logger;

    @Override
    public ProjectData getProject(String projectId) {
        ProjectData projectData = new ProjectData();
        this.setProjectModelValues(projectData);
        logger.info("Projectname: " + projectData.getProjectModelData().getProjectname());
        return projectData;
    }

    private void setProjectModelValues(ProjectData projectData) {
        ProjectModelData projectModelData = projectData.getProjectModelData();
        projectModelData.setProjectname("Foenix hosting");
        //projectData.setProjectModelData(projectModelData);
    }

}
