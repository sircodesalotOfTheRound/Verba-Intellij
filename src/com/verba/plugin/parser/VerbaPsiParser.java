package com.verba.plugin.parser;

import com.intellij.lang.ASTNode;
import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiParser;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

/**
 * Created by sircodesalot on 14/11/21.
 */
public class VerbaPsiParser implements PsiParser {
  @NotNull
  @Override
  public ASTNode parse(IElementType root, PsiBuilder builder) {
    PsiBuilder.Marker rootSegment = builder.mark();
    rootSegment.done(root);

    return builder.getTreeBuilt();
  }
}
