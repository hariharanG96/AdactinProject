package com.adactin.helper;

import java.io.IOException;

public class FileReaderManager {

	private FileReaderManager() {
	}

	public static FileReaderManager getFRM() {
		FileReaderManager frm = new FileReaderManager();
		return frm;
	}

	public ConfigurationReader getObjectCR() throws IOException {
		ConfigurationReader cr = new ConfigurationReader();
		return cr;
	}
}