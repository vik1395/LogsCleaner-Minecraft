package me.vik1395.LogsCleaner;

import java.io.File;

import org.bukkit.plugin.java.JavaPlugin;

/*

Author: Vik1395
Project: LogsCleaner

Copyright 2015

Licensed under Creative CommonsAttribution-ShareAlike 4.0 International Public License (the "License");
You may not use this file except in compliance with the License.

You may obtain a copy of the License at http://creativecommons.org/licenses/by-sa/4.0/legalcode

You may find an abridged version of the License at http://creativecommons.org/licenses/by-sa/4.0/
 */

public class Main extends JavaPlugin{
	
	public void onEnable()
	{
		File logdir = new File("logs");
		if(logdir.exists())
		{
			String[]entries = logdir.list();
			for(String s: entries)
			{
			    File currentFile = new File(logdir.getPath(),s);
			    currentFile.delete();
			}
			getLogger().info(entries.length + " files have been deleted from the logs folder!");
		}
	}

}
