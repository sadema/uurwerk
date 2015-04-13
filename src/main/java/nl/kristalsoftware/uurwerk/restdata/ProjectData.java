package nl.kristalsoftware.uurwerk.restdata;

import nl.kristalsoftware.uurwerk.modeldata.ProjectModelData;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by sjoerdadema on 12-04-15.
 */
@XmlRootElement(name="project")
@XmlAccessorType(XmlAccessType.NONE)
public class ProjectData {

    private ProjectModelData projectModelData = new ProjectModelData();

    public ProjectData() {}

    @XmlElement(name="projectname")
    public String getProjectName() {
        return projectModelData.getProjectname();
    }

    public void setProjectName(String projectName) {
        projectModelData.setProjectname(projectName);
    }

    public ProjectModelData getProjectModelData() {
        return projectModelData;
    }

}
