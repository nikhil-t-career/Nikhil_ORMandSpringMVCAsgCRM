package my.smvc.hib.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class DispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
    protected Class < ? > [] getRootConfigClasses() {
        return new Class[] {
            ApplicationContext.class
        };
    }

	@Override
    protected Class < ? > [] getServletConfigClasses() {
        return new Class[] {
            WebMvcConfigurerImpl.class
        };
    }

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}
}