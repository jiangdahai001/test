package com.example.test.normal;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.net.URI;
import java.util.Timer;
import java.util.TimerTask;

public class OpenBrowser {
  public static void main(String[] args) {
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
