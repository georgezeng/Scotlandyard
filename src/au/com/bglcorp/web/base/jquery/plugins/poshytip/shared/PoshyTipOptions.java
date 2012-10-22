package au.com.bglcorp.web.base.jquery.plugins.poshytip.shared;

public class PoshyTipOptions {
  public static final String YELLOW_CLASS = "tip-yellow";
  public static final String YELLOW_SIMPLE_CLASS = "tip-yellowsimple";
  public static final String VIOLET_CLASS = "tip-violet";
  public static final String DARKGRAY_CLASS = "tip-darkgray";
  public static final String GREEN_CLASS = "tip-green";
  public static final String TWITTER_CLASS = "tip-twitter";
  public static final String SKYBLUE_CLASS = "tip-skyblue";

  public static final String pdfparse_CLASS = "tip-pdfparse";
  public static final String pdfparse_RED_CLASS = "tip-pdfparse-red";

  // setting default values
  private String content = "[title]";
  private String className = TWITTER_CLASS;
  private int bgImageFrameSize = 10;
  private int showTimeout = 500;
  private int hideTimeout = 100;
  private String showOn = "hover";// hover
  private String alignTo = "cursor";
  private String alignX = "right";
  private String alignY = "top";
  private int offsetX = -22;
  private int offsetY = 18;
  private boolean allowTipHover = true;
  private boolean fade = true;
  private boolean slide = true;
  private int slideOffset = 8;
  private int showAniDuration = 300;
  private int hideAniDuration = 300;
  private boolean showInfoIcon = false;

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getClassName() {
    return className;
  }

  public void setClassName(String className) {
    this.className = className;
  }

  public int getBgImageFrameSize() {
    return bgImageFrameSize;
  }

  public void setBgImageFrameSize(int bgImageFrameSize) {
    this.bgImageFrameSize = bgImageFrameSize;
  }

  public int getShowTimeout() {
    return showTimeout;
  }

  public void setShowTimeout(int showTimeout) {
    this.showTimeout = showTimeout;
  }

  public int getHideTimeout() {
    return hideTimeout;
  }

  public void setHideTimeout(int hideTimeout) {
    this.hideTimeout = hideTimeout;
  }

  public String getShowOn() {
    return showOn;
  }

  public void setShowOn(String showOn) {
    this.showOn = showOn;
  }

  public String getAlignTo() {
    return alignTo;
  }

  public void setAlignTo(String alignTo) {
    this.alignTo = alignTo;
  }

  public String getAlignX() {
    return alignX;
  }

  public void setAlignX(String alignX) {
    this.alignX = alignX;
  }

  public String getAlignY() {
    return alignY;
  }

  public void setAlignY(String alignY) {
    this.alignY = alignY;
  }

  public int getOffsetX() {
    return offsetX;
  }

  public void setOffsetX(int offsetX) {
    this.offsetX = offsetX;
  }

  public int getOffsetY() {
    return offsetY;
  }

  public void setOffsetY(int offsetY) {
    this.offsetY = offsetY;
  }

  public boolean isAllowTipHover() {
    return allowTipHover;
  }

  public void setAllowTipHover(boolean allowTipHover) {
    this.allowTipHover = allowTipHover;
  }

  public boolean isFade() {
    return fade;
  }

  public void setFade(boolean fade) {
    this.fade = fade;
  }

  public boolean isSlide() {
    return slide;
  }

  public void setSlide(boolean slide) {
    this.slide = slide;
  }

  public int getSlideOffset() {
    return slideOffset;
  }

  public void setSlideOffset(int slideOffset) {
    this.slideOffset = slideOffset;
  }

  public int getShowAniDuration() {
    return showAniDuration;
  }

  public void setShowAniDuration(int showAniDuration) {
    this.showAniDuration = showAniDuration;
  }

  public int getHideAniDuration() {
    return hideAniDuration;
  }

  public void setHideAniDuration(int hideAniDuration) {
    this.hideAniDuration = hideAniDuration;
  }

  public boolean isShowInfoIcon() {
    return showInfoIcon;
  }

  public void setShowInfoIcon(boolean showInfoIcon) {
    this.showInfoIcon = showInfoIcon;
  }

}
