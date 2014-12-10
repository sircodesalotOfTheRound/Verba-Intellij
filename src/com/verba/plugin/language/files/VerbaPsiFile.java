package com.verba.plugin.language.files;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

/**
 * Created by sircodesalot on 14/11/21.
 */
public class VerbaPsiFile extends PsiFileBase {
  public VerbaPsiFile(@NotNull FileViewProvider viewProvider) {
    super(viewProvider, VerbaLanguage.INSTANCE);
  }

  @NotNull
  @Override
  public FileType getFileType() { return VerbaFileType.INSTANCE; }
}
