package com.meldmy.github;

import com.meldmy.github.pages.GitHubRepositoryPage;
import org.fluentlenium.adapter.junit.FluentTest;
import org.fluentlenium.core.annotation.Page;
import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testcontainers.containers.BrowserWebDriverContainer;

public class FluentleniumExampleTest extends FluentTest {
    
    @Rule
    public BrowserWebDriverContainer browser = new BrowserWebDriverContainer()
            .withCapabilities(new ChromeOptions());
    @Page
    private GitHubRepositoryPage repositoryPage;

    @Test
    public void shouldHaveMoreThanZeroSocialCount() {
        goTo(repositoryPage)
                .assertIsSocialCountMoreThan(0);
    }
}
