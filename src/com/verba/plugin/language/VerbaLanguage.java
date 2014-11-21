package com.verba.plugin.language;

import com.intellij.lang.Language;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * Created by sircodesalot on 14/11/21.
 */
public class VerbaLanguage extends Language {
  public static VerbaLanguage INSTANCE = new VerbaLanguage();

  private VerbaLanguage() {
    super("Verba.Language");
  }
}
