package com.haulmont.demo.admintools.processors;

import com.haulmont.addon.admintools.core.auto_import.processors.DefaultAutoImportProcessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("autoimport_GroupsAutoImportProcessor")
public class GroupsAutoImportProcessor extends DefaultAutoImportProcessor {

    protected Logger log = LoggerFactory.getLogger(GroupsAutoImportProcessor.class);

    @Override
    public void processFile(String filePath) throws Exception {
        super.processFile(filePath);
        log.info("Importing have done!");
    }
}
