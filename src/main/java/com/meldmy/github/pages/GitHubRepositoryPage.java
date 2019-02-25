package com.meldmy.github.pages;

import org.fluentlenium.core.FluentPage;
import org.fluentlenium.core.annotation.PageUrl;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;

import static java.lang.Integer.parseInt;
import static org.junit.Assert.assertTrue;

@PageUrl("https://github.com/meldmy/fluentlenium-on-testcontainers")
public class GitHubRepositoryPage extends FluentPage {
    
    @FindBy(css = ".social-count")
    private FluentWebElement socialCount;

    public GitHubRepositoryPage assertIsSocialCountMoreThan(int expectedSocialCount) {
        int actualSocialCount = parseInt(socialCount.text());
        assertTrue(actualSocialCount > expectedSocialCount);
        return this;
    }
}
