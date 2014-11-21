package com.verba.plugin.language;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiFile;
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
