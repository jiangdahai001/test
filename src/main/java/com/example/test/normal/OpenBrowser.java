package com.example.test.normal;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.URI;
import java.util.Timer;
import java.util.TimerTask;
import java.util.prefs.Preferences;

public class OpenBrowser {
  public static void main(String[] args) {
    exec();
  }
  public static void exec() {
    String cmd = "\"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe\" --kiosk geneplus.cn";
//    String cmd = "\"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe\" --app=https://geneplus.cn --start-fullscreen";
//    String cmd = "\"C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe\" --app=https://geneplus.cn --start-fullscreen";
//    String cmd = "\"C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe\" --kiosk https://geneplus.cn --edge-kiosk-type=fullscreen";
//    String cmd = "\"C:\\Program Files\\Mozilla Firefox\\firefox.exe\" --kiosk https://geneplus.cn";
    try {
      Runtime.getRuntime().exec(cmd);
    } catch(Exception e) {
      e.printStackTrace();
    }
  }
  public static void browser() {
    try {
      // 创建一个URI对象，指定要打开的URL
      URI uri = new URI("https://geneplus.cn");
      // 获取桌面实例
      Desktop desktop = Desktop.getDesktop();
      // 判断桌面是否支持浏览器操作
      if (desktop.isSupported(Desktop.Action.BROWSE)) {
        // 打开默认浏览器并加载指定URL
        desktop.browse(uri);
        Timer timer = new Timer("fullscreen");
        TimerTask task = new TimerTask() {
          @Override
          public void run() {
            try {
              Robot robot = new Robot();
              // 打开全屏
              robot.keyPress(KeyEvent.VK_F11);
              robot.keyRelease(KeyEvent.VK_F11);
            } catch (Exception e) {
              e.printStackTrace();
            }
            timer.cancel();
          }
        };
        timer.schedule(task, 1000L);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
