package com.koshuke.github;

import org.kohsuke.github.GHOrganization;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitHubBuilder;

import java.io.IOException;

public class CreatePublicRepository {

    public static void main(String[] args) throws IOException {

        String organization = "TestgitOrg3";
        GitHub github = new GitHubBuilder().withOAuthToken("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","TestgitOrg3").build();


        GHOrganization org = github.getOrganization(organization);

        GHRepository repository = org.createRepository("repository-public")
                .private_(false)
                .wiki(false)
                .projects(false)
                .description("Description")
                .allowMergeCommit(true)
                .allowSquashMerge(false)
                .allowRebaseMerge(false)
                .create();
    }
}
