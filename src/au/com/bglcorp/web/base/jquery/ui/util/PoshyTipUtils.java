package au.com.bglcorp.web.base.jquery.ui.util;

import au.com.bglcorp.web.base.jquery.plugins.poshytip.shared.PoshyTipOptions;

/**
 * @author Denny(Kong Fan Zhi)
 * @date 2012-5-25
 * 
 */
public class PoshyTipUtils {
  public static PoshyTipOptions getDefaultOptions() {
    PoshyTipOptions opt = new PoshyTipOptions();
    opt.setClassName("tip-pdfparse");
   
    return opt;
  }

  public static PoshyTipOptions getPoshyOptions() {
    PoshyTipOptions options = getDefaultOptions();

    options.setShowOn("focus");
    options.setAlignTo("target");
    options.setAlignX("right");
    options.setAlignY("center");
    options.setOffsetX(15);
    options.setShowInfoIcon(true);
    return options;
  }

  public static PoshyTipOptions getPoshyOptionsArrowDown() {
    PoshyTipOptions options = getDefaultOptions();
    options.setShowOn("focus");
    options.setAlignTo("target");
    options.setAlignX("inner-left");
    options.setOffsetX(0);
    options.setOffsetY(5);
    options.setShowInfoIcon(true);
    return options;
  }
}
