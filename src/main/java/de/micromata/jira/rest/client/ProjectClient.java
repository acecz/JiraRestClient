package de.micromata.jira.rest.client;

import de.micromata.jira.rest.JiraRestClient;
import de.micromata.jira.rest.core.domain.*;
import de.micromata.jira.rest.core.util.RestException;

import java.util.List;

/**
 * The IssueClient provides all Informations for Jira Issues
 * <p/>
 * Author: Christian Schulze c.schulze@micromata.de
 */
public interface ProjectClient {


    /**
     * Returns a list of all projects the logged in User can see..
     *
     * @return list of projects
     * @throws RestException
     */
    public List<BasicProjectBean> getAllProjects() throws RestException;

    /**
     * Returns a full representation of the project for the given key.
     *
     * @param projectKey = the project key
     * @return all informations for the project
     * @throws RestException
     */
    public ProjectBean getProjectByKey(String projectKey) throws RestException;

    /**
     * Returns a list of all versions for a project.
     *
     * @param projectKey = the project key
     * @return list of versions
     * @throws RestException
     */
    public List<VersionBean> getProjectVersions(String projectKey) throws RestException;


    /**
     * Returns a list of all components for a project.
     *
     * @param projectKey = the project key
     * @return list of components
     * @throws RestException
     */
    public List<ComponentBean> getProjectComponents(String projectKey) throws RestException;


}