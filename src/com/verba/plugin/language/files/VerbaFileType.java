package com.verba.plugin.language.files;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * Created by sircodesalot on 14/11/21.
 */
public class VerbaFileType extends LanguageFileType {
  public static VerbaFileType INSTANCE = new VerbaFileType();

  private VerbaFileType() {
    super(VerbaLanguage.INSTANCE);
  }

  @NotNull
  @Override
  public String getName() { return "Verba.Language.File"; }

  @NotNull
  @Override
  public String getDescription() { return "Verba language file"; }

  @NotNull
  @Override
  public String getDefaultExtension() { return "v"; }

  @Nullable
  @Override
  public Icon getIcon() { return null; }

}
