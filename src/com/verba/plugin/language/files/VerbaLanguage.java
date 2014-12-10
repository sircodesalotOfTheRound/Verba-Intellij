package com.verba.plugin.language.files;

import com.intellij.lang.Language;

/**
 * Created by sircodesalot on 14/11/21.
 */
public class VerbaLanguage extends Language {
  public static VerbaLanguage INSTANCE = new VerbaLanguage();

  private VerbaLanguage() {
    super("Verba.Language");
  }
}
