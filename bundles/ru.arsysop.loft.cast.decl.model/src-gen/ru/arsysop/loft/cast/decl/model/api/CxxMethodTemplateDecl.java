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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cxx Method Template Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.arsysop.loft.cast.decl.model.api.CxxMethodTemplateDecl#getClassTemplate <em>Class Template</em>}</li>
 * </ul>
 *
 * @see ru.arsysop.loft.cast.decl.model.meta.DeclPackage#getCxxMethodTemplateDecl()
 * @model
 * @generated
 */
public interface CxxMethodTemplateDecl extends NamedDecl {
	/**
	 * Returns the value of the '<em><b>Class Template</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ru.arsysop.loft.cast.decl.model.api.ClassTemplateDecl#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Template</em>' container reference.
	 * @see #setClassTemplate(ClassTemplateDecl)
	 * @see ru.arsysop.loft.cast.decl.model.meta.DeclPackage#getCxxMethodTemplateDecl_ClassTemplate()
	 * @see ru.arsysop.loft.cast.decl.model.api.ClassTemplateDecl#getMethods
	 * @model opposite="methods" required="true" transient="false"
	 * @generated
	 */
	ClassTemplateDecl getClassTemplate();

	/**
	 * Sets the value of the '{@link ru.arsysop.loft.cast.decl.model.api.CxxMethodTemplateDecl#getClassTemplate <em>Class Template</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Template</em>' container reference.
	 * @see #getClassTemplate()
	 * @generated
	 */
	void setClassTemplate(ClassTemplateDecl value);

} // CxxMethodTemplateDecl
