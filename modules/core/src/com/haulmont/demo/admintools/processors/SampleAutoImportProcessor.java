package com.haulmont.demo.admintools.processors;

import com.haulmont.addon.admintools.core.auto_import.processors.AutoImportProcessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SampleAutoImportProcessor implements AutoImportProcessor {

    protected Logger log = LoggerFactory.getLogger(SampleAutoImportProcessor.class);

    @Override
    public void processFile(String filePath) {
        log.info("Importing have done!");
    }

}
