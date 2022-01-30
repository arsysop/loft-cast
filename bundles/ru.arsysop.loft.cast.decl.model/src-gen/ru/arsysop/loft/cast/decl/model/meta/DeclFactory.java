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

import org.eclipse.emf.ecore.EFactory;

import ru.arsysop.loft.cast.decl.model.api.ClassTemplateDecl;
import ru.arsysop.loft.cast.decl.model.api.CxxMethodTemplateDecl;
import ru.arsysop.loft.cast.decl.model.api.FunctionDecl;
import ru.arsysop.loft.cast.decl.model.api.NamespaceDecl;
import ru.arsysop.loft.cast.decl.model.api.TranslationUnitDecl;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ru.arsysop.loft.cast.decl.model.meta.DeclPackage
 * @generated
 */
public interface DeclFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DeclFactory eINSTANCE = ru.arsysop.loft.cast.decl.model.impl.DeclFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Translation Unit Decl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Translation Unit Decl</em>'.
	 * @generated
	 */
	TranslationUnitDecl createTranslationUnitDecl();

	/**
	 * Returns a new object of class '<em>Namespace Decl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Namespace Decl</em>'.
	 * @generated
	 */
	NamespaceDecl createNamespaceDecl();

	/**
	 * Returns a new object of class '<em>Class Template Decl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Template Decl</em>'.
	 * @generated
	 */
	ClassTemplateDecl createClassTemplateDecl();

	/**
	 * Returns a new object of class '<em>Cxx Method Template Decl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cxx Method Template Decl</em>'.
	 * @generated
	 */
	CxxMethodTemplateDecl createCxxMethodTemplateDecl();

	/**
	 * Returns a new object of class '<em>Function Decl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Decl</em>'.
	 * @generated
	 */
	FunctionDecl createFunctionDecl();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DeclPackage getDeclPackage();

} //CastFactory
