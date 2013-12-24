package <%=packageName%>.service.impl;

import <%=packageName%>.service.<%= serviceClass %>Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class <%= serviceClass %>ServiceImpl implements <%= serviceClass %>Service {

    private final Logger log = LoggerFactory.getLogger(<%= serviceClass %>ServiceImpl.class);

}
