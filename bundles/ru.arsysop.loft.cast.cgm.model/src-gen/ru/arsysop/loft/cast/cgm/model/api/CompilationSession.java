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
package ru.arsysop.loft.cast.cgm.model.api;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compilation Session</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.arsysop.loft.cast.cgm.model.api.CompilationSession#getTool <em>Tool</em>}</li>
 *   <li>{@link ru.arsysop.loft.cast.cgm.model.api.CompilationSession#getOptions <em>Options</em>}</li>
 *   <li>{@link ru.arsysop.loft.cast.cgm.model.api.CompilationSession#getIndex <em>Index</em>}</li>
 *   <li>{@link ru.arsysop.loft.cast.cgm.model.api.CompilationSession#getCalls <em>Calls</em>}</li>
 * </ul>
 *
 * @see ru.arsysop.loft.cast.cgm.model.meta.CgmPackage#getCompilationSession()
 * @model
 * @generated
 */
public interface CompilationSession extends EObject {
	/**
	 * Returns the value of the '<em><b>Tool</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tool</em>' containment reference.
	 * @see #setTool(Tool)
	 * @see ru.arsysop.loft.cast.cgm.model.meta.CgmPackage#getCompilationSession_Tool()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Tool getTool();

	/**
	 * Sets the value of the '{@link ru.arsysop.loft.cast.cgm.model.api.CompilationSession#getTool <em>Tool</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tool</em>' containment reference.
	 * @see #getTool()
	 * @generated
	 */
	void setTool(Tool value);

	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' containment reference.
	 * @see #setOptions(Options)
	 * @see ru.arsysop.loft.cast.cgm.model.meta.CgmPackage#getCompilationSession_Options()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Options getOptions();

	/**
	 * Sets the value of the '{@link ru.arsysop.loft.cast.cgm.model.api.CompilationSession#getOptions <em>Options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Options</em>' containment reference.
	 * @see #getOptions()
	 * @generated
	 */
	void setOptions(Options value);

	/**
	 * Returns the value of the '<em><b>Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' containment reference.
	 * @see #setIndex(Index)
	 * @see ru.arsysop.loft.cast.cgm.model.meta.CgmPackage#getCompilationSession_Index()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Index getIndex();

	/**
	 * Sets the value of the '{@link ru.arsysop.loft.cast.cgm.model.api.CompilationSession#getIndex <em>Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' containment reference.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(Index value);

	/**
	 * Returns the value of the '<em><b>Calls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calls</em>' containment reference.
	 * @see #setCalls(CallTree)
	 * @see ru.arsysop.loft.cast.cgm.model.meta.CgmPackage#getCompilationSession_Calls()
	 * @model containment="true"
	 * @generated
	 */
	CallTree getCalls();

	/**
	 * Sets the value of the '{@link ru.arsysop.loft.cast.cgm.model.api.CompilationSession#getCalls <em>Calls</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calls</em>' containment reference.
	 * @see #getCalls()
	 * @generated
	 */
	void setCalls(CallTree value);

} // CompilationSession
