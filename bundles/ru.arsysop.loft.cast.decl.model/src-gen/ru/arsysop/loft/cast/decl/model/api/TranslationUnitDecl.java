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
package ru.arsysop.loft.cast.decl.model.api;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Translation Unit Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.arsysop.loft.cast.decl.model.api.TranslationUnitDecl#getDeclarations <em>Declarations</em>}</li>
 * </ul>
 *
 * @see ru.arsysop.loft.cast.decl.model.meta.DeclPackage#getTranslationUnitDecl()
 * @model
 * @generated
 */
public interface TranslationUnitDecl extends NamedDecl {
	/**
	 * Returns the value of the '<em><b>Declarations</b></em>' reference list.
	 * The list contents are of type {@link ru.arsysop.loft.cast.decl.model.api.NamedDecl}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declarations</em>' reference list.
	 * @see ru.arsysop.loft.cast.decl.model.meta.DeclPackage#getTranslationUnitDecl_Declarations()
	 * @model
	 * @generated
	 */
	EList<NamedDecl> getDeclarations();

} // TranslationUnitDecl
