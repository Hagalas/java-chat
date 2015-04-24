package com.project.examples.app;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

  private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

  public static void main(final String[] args) {
    DbHelper.getInstance().init();
    DbHelper.getInstance().registerShutdownHook();

    SwingUtilities.invokeLater(new Runnable() {
      @Override
      public void run() {
        Main.LOGGER.debug("Starting application");

        final Application app = new Application();
        app.setTitle("Czat Agnieszki i Oskara");
        app.setSize(800, 600);
        app.setLocationRelativeTo(null);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
      }
    });
  }
}
