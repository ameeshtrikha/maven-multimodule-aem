package ${package}.commons.impl;

import ${package}.commons.CommonsService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;



@Service
@Component
public class CommonServiceImpl implements CommonsService {

    private static final Logger LOG = LoggerFactory.getLogger(CommonServiceImpl.class);

    public void printName() {
        LOG.debug("From CommonServiceImpl class");
    }
}