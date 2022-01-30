/**
 * Copyright (c) 2022 ArSysOp
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * 	http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 	SPDX-License-Identifier: Apache-2.0
 * Contributors:
 * 	ArSysOp - initial API and implementation
 * 
 */
package ru.arsysop.loft.cast.decl.model.meta;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ru.arsysop.loft.cast.decl.model.meta.DeclFactory
 * @model kind="package"
 * @generated
 */
public interface DeclPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "decl"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.arsysop.ru/cast/decl/0.1.0"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "decl"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DeclPackage eINSTANCE = ru.arsysop.loft.cast.decl.model.impl.DeclPackageImpl.init();

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.cast.decl.model.impl.NamedDeclImpl <em>Named Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.cast.decl.model.impl.NamedDeclImpl
	 * @see ru.arsysop.loft.cast.decl.model.impl.DeclPackageImpl#getNamedDecl()
	 * @generated
	 */
	int NAMED_DECL = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_DECL__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_DECL__NAME = 1;

	/**
	 * The number of structural features of the '<em>Named Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_DECL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Named Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_DECL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.cast.decl.model.impl.TranslationUnitDeclImpl <em>Translation Unit Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.cast.decl.model.impl.TranslationUnitDeclImpl
	 * @see ru.arsysop.loft.cast.decl.model.impl.DeclPackageImpl#getTranslationUnitDecl()
	 * @generated
	 */
	int TRANSLATION_UNIT_DECL = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION_UNIT_DECL__ID = NAMED_DECL__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION_UNIT_DECL__NAME = NAMED_DECL__NAME;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION_UNIT_DECL__DECLARATIONS = NAMED_DECL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Translation Unit Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION_UNIT_DECL_FEATURE_COUNT = NAMED_DECL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Translation Unit Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION_UNIT_DECL_OPERATION_COUNT = NAMED_DECL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.cast.decl.model.impl.NamespaceDeclImpl <em>Namespace Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.cast.decl.model.impl.NamespaceDeclImpl
	 * @see ru.arsysop.loft.cast.decl.model.impl.DeclPackageImpl#getNamespaceDecl()
	 * @generated
	 */
	int NAMESPACE_DECL = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_DECL__ID = NAMED_DECL__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_DECL__NAME = NAMED_DECL__NAME;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_DECL__DECLARATIONS = NAMED_DECL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Namespace Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_DECL_FEATURE_COUNT = NAMED_DECL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Namespace Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_DECL_OPERATION_COUNT = NAMED_DECL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.cast.decl.model.impl.ClassTemplateDeclImpl <em>Class Template Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.cast.decl.model.impl.ClassTemplateDeclImpl
	 * @see ru.arsysop.loft.cast.decl.model.impl.DeclPackageImpl#getClassTemplateDecl()
	 * @generated
	 */
	int CLASS_TEMPLATE_DECL = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TEMPLATE_DECL__ID = NAMED_DECL__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TEMPLATE_DECL__NAME = NAMED_DECL__NAME;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TEMPLATE_DECL__METHODS = NAMED_DECL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Class Template Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TEMPLATE_DECL_FEATURE_COUNT = NAMED_DECL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Class Template Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TEMPLATE_DECL_OPERATION_COUNT = NAMED_DECL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.cast.decl.model.impl.CxxMethodTemplateDeclImpl <em>Cxx Method Template Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.cast.decl.model.impl.CxxMethodTemplateDeclImpl
	 * @see ru.arsysop.loft.cast.decl.model.impl.DeclPackageImpl#getCxxMethodTemplateDecl()
	 * @generated
	 */
	int CXX_METHOD_TEMPLATE_DECL = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CXX_METHOD_TEMPLATE_DECL__ID = NAMED_DECL__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CXX_METHOD_TEMPLATE_DECL__NAME = NAMED_DECL__NAME;

	/**
	 * The feature id for the '<em><b>Class Template</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CXX_METHOD_TEMPLATE_DECL__CLASS_TEMPLATE = NAMED_DECL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cxx Method Template Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CXX_METHOD_TEMPLATE_DECL_FEATURE_COUNT = NAMED_DECL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cxx Method Template Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CXX_METHOD_TEMPLATE_DECL_OPERATION_COUNT = NAMED_DECL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.cast.decl.model.impl.FunctionDeclImpl <em>Function Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.cast.decl.model.impl.FunctionDeclImpl
	 * @see ru.arsysop.loft.cast.decl.model.impl.DeclPackageImpl#getFunctionDecl()
	 * @generated
	 */
	int FUNCTION_DECL = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECL__ID = NAMED_DECL__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECL__NAME = NAMED_DECL__NAME;

	/**
	 * The number of structural features of the '<em>Function Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECL_FEATURE_COUNT = NAMED_DECL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Function Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECL_OPERATION_COUNT = NAMED_DECL_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.cast.decl.model.api.NamedDecl <em>Named Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Decl</em>'.
	 * @see ru.arsysop.loft.cast.decl.model.api.NamedDecl
	 * @generated
	 */
	EClass getNamedDecl();

	/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.loft.cast.decl.model.api.NamedDecl#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ru.arsysop.loft.cast.decl.model.api.NamedDecl#getId()
	 * @see #getNamedDecl()
	 * @generated
	 */
	EAttribute getNamedDecl_Id();

	/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.loft.cast.decl.model.api.NamedDecl#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ru.arsysop.loft.cast.decl.model.api.NamedDecl#getName()
	 * @see #getNamedDecl()
	 * @generated
	 */
	EAttribute getNamedDecl_Name();

	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.cast.decl.model.api.TranslationUnitDecl <em>Translation Unit Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Translation Unit Decl</em>'.
	 * @see ru.arsysop.loft.cast.decl.model.api.TranslationUnitDecl
	 * @generated
	 */
	EClass getTranslationUnitDecl();

	/**
	 * Returns the meta object for the reference list '{@link ru.arsysop.loft.cast.decl.model.api.TranslationUnitDecl#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Declarations</em>'.
	 * @see ru.arsysop.loft.cast.decl.model.api.TranslationUnitDecl#getDeclarations()
	 * @see #getTranslationUnitDecl()
	 * @generated
	 */
	EReference getTranslationUnitDecl_Declarations();

	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.cast.decl.model.api.NamespaceDecl <em>Namespace Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Namespace Decl</em>'.
	 * @see ru.arsysop.loft.cast.decl.model.api.NamespaceDecl
	 * @generated
	 */
	EClass getNamespaceDecl();

	/**
	 * Returns the meta object for the reference list '{@link ru.arsysop.loft.cast.decl.model.api.NamespaceDecl#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Declarations</em>'.
	 * @see ru.arsysop.loft.cast.decl.model.api.NamespaceDecl#getDeclarations()
	 * @see #getNamespaceDecl()
	 * @generated
	 */
	EReference getNamespaceDecl_Declarations();

	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.cast.decl.model.api.ClassTemplateDecl <em>Class Template Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Template Decl</em>'.
	 * @see ru.arsysop.loft.cast.decl.model.api.ClassTemplateDecl
	 * @generated
	 */
	EClass getClassTemplateDecl();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.arsysop.loft.cast.decl.model.api.ClassTemplateDecl#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see ru.arsysop.loft.cast.decl.model.api.ClassTemplateDecl#getMethods()
	 * @see #getClassTemplateDecl()
	 * @generated
	 */
	EReference getClassTemplateDecl_Methods();

	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.cast.decl.model.api.CxxMethodTemplateDecl <em>Cxx Method Template Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cxx Method Template Decl</em>'.
	 * @see ru.arsysop.loft.cast.decl.model.api.CxxMethodTemplateDecl
	 * @generated
	 */
	EClass getCxxMethodTemplateDecl();

	/**
	 * Returns the meta object for the container reference '{@link ru.arsysop.loft.cast.decl.model.api.CxxMethodTemplateDecl#getClassTemplate <em>Class Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Class Template</em>'.
	 * @see ru.arsysop.loft.cast.decl.model.api.CxxMethodTemplateDecl#getClassTemplate()
	 * @see #getCxxMethodTemplateDecl()
	 * @generated
	 */
	EReference getCxxMethodTemplateDecl_ClassTemplate();

	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.cast.decl.model.api.FunctionDecl <em>Function Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Decl</em>'.
	 * @see ru.arsysop.loft.cast.decl.model.api.FunctionDecl
	 * @generated
	 */
	EClass getFunctionDecl();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DeclFactory getDeclFactory();

} //CastPackage
