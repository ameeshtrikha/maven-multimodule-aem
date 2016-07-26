package ${package}.ui.slingmodel.sample;

import javax.annotation.PostConstruct;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;

import javax.annotation.PostConstruct;
import javax.inject.Inject;


@Model(adaptables = SlingHttpServletRequest.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class SampleModel {

    /**
     * sling request.
     */
    @SlingObject
    private SlingHttpServletRequest request;

    /**
     * Processing method.
     */
    @PostConstruct
    public final void init() {
        // your code here.
    }

}