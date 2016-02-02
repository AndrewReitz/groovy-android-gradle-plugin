ruleset {
  // rulesets/braces.xml
  ElseBlockBraces
  ForStatementBraces
  IfStatementBraces
  WhileStatementBraces

  // rulesets/imports.xml
  DuplicateImport
  ImportFromSamePackage
  UnnecessaryGroovyImport
  UnusedImport

  // rulesets/naming.xml
  AbstractClassName
  ClassName {
    regex = '^[A-Z][\\$a-zA-Z0-9]*$'
  }
  ClassNameSameAsFilename
  FieldName {
    regex = '^_?[a-z][a-zA-Z0-9]*$'
    finalRegex = '^_?[a-z][a-zA-Z0-9]*$'
    staticFinalRegex = '^logger$|^[A-Z][A-Z_0-9]*$|^serialVersionUID$'
  }
  InterfaceName
  MethodName {
    regex = '^[a-z][\\$_a-zA-Z0-9]*$|^.*\\s.*$'
  }
  ObjectOverrideMisspelledMethodName
  PackageName
  ParameterName
  PropertyName
  VariableName {
    finalRegex = '^[a-z][a-zA-Z0-9]*$'
  }

  // rulesets/unnecessary.xml
  AddEmptyString
  ConsecutiveLiteralAppends
  ConsecutiveStringConcatenation
  UnnecessaryBigDecimalInstantiation
  UnnecessaryBigIntegerInstantiation
  UnnecessaryBooleanExpression
  UnnecessaryBooleanInstantiation
  UnnecessaryCallToSubstring
  UnnecessaryCatchBlock
  UnnecessaryCollectionCall
  UnnecessaryConstructor
  UnnecessaryDefInFieldDeclaration
  UnnecessaryDefInMethodDeclaration
  UnnecessaryDefInVariableDeclaration
  UnnecessaryDotClass
  UnnecessaryDoubleInstantiation
  UnnecessaryElseStatement
  UnnecessaryFinalOnPrivateMethod
  UnnecessaryFloatInstantiation
  UnnecessaryIfStatement
  UnnecessaryInstanceOfCheck
  UnnecessaryInstantiationToGetClass
  UnnecessaryIntegerInstantiation
  UnnecessaryLongInstantiation
  UnnecessaryModOne
  UnnecessaryNullCheck
  UnnecessaryNullCheckBeforeInstanceOf
  UnnecessaryObjectReferences
  UnnecessaryOverridingMethod
  UnnecessaryParenthesesForMethodCallWithClosure
  UnnecessaryPublicModifier
  UnnecessarySemicolon
  UnnecessaryStringInstantiation
  UnnecessaryTernaryExpression
  UnnecessaryTransientModifier

  // rulesets/unused.xml
  UnusedArray
  UnusedObject
  UnusedPrivateField
  UnusedPrivateMethod
  UnusedPrivateMethodParameter
  UnusedVariable
}
