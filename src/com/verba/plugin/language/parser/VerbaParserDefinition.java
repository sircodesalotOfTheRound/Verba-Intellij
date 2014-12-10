package com.verba.plugin.language.parser;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import com.verba.plugin.language.files.VerbaLanguage;
import com.verba.plugin.language.files.VerbaPsiFile;
import org.jetbrains.annotations.NotNull;

/**
 * Created by sircodesalot on 14/11/21.
 */
public class VerbaParserDefinition implements ParserDefinition {
  public static final IFileElementType fileType = new IFileElementType(VerbaLanguage.INSTANCE);

  @NotNull
  @Override
  public Lexer createLexer(Project project) { return new VerbaIDELexer(); }

  @Override
  public PsiParser createParser(Project project) { return new VerbaPsiParser(); }

  @Override
  public IFileElementType getFileNodeType() { return fileType; }

  @NotNull
  @Override
  public TokenSet getWhitespaceTokens() { return TokenSet.EMPTY; }

  @NotNull
  @Override
  public TokenSet getCommentTokens() { return TokenSet.EMPTY; }

  @NotNull
  @Override
  public TokenSet getStringLiteralElements() { return TokenSet.EMPTY; }

  @NotNull
  @Override
  public PsiElement createElement(ASTNode node) { return null; }

  @Override
  public PsiFile createFile(FileViewProvider viewProvider) { return new VerbaPsiFile(viewProvider); }

  @Override
  public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode left, ASTNode right) { return SpaceRequirements.MAY; }
}
