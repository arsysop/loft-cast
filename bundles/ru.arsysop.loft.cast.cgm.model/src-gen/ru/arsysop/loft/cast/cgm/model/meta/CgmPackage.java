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
package ru.arsysop.loft.cast.cgm.model.meta;

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
 * @see ru.arsysop.loft.cast.cgm.model.meta.CgmFactory
 * @model kind="package"
 * @generated
 */
public interface CgmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cgm"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.arsysop.ru/cast/cgm/0.1.0"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cgm"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CgmPackage eINSTANCE = ru.arsysop.loft.cast.cgm.model.impl.CgmPackageImpl.init();

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.cast.cgm.model.impl.CompilationSessionImpl <em>Compilation Session</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.cast.cgm.model.impl.CompilationSessionImpl
	 * @see ru.arsysop.loft.cast.cgm.model.impl.CgmPackageImpl#getCompilationSession()
	 * @generated
	 */
	int COMPILATION_SESSION = 0;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_SESSION__TOOL = 0;

	/**
	 * The feature id for the '<em><b>Options</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_SESSION__OPTIONS = 1;

	/**
	 * The feature id for the '<em><b>Index</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_SESSION__INDEX = 2;

	/**
	 * The feature id for the '<em><b>Calls</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_SESSION__CALLS = 3;

	/**
	 * The number of structural features of the '<em>Compilation Session</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_SESSION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Compilation Session</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_SESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.cast.cgm.model.impl.ToolImpl <em>Tool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.cast.cgm.model.impl.ToolImpl
	 * @see ru.arsysop.loft.cast.cgm.model.impl.CgmPackageImpl#getTool()
	 * @generated
	 */
	int TOOL = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.cast.cgm.model.impl.OptionsImpl <em>Options</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.cast.cgm.model.impl.OptionsImpl
	 * @see ru.arsysop.loft.cast.cgm.model.impl.CgmPackageImpl#getOptions()
	 * @generated
	 */
	int OPTIONS = 2;

	/**
	 * The number of structural features of the '<em>Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.cast.cgm.model.impl.IndexImpl <em>Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.cast.cgm.model.impl.IndexImpl
	 * @see ru.arsysop.loft.cast.cgm.model.impl.CgmPackageImpl#getIndex()
	 * @generated
	 */
	int INDEX = 3;

	/**
	 * The number of structural features of the '<em>Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.cast.cgm.model.impl.CallTreeImpl <em>Call Tree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.cast.cgm.model.impl.CallTreeImpl
	 * @see ru.arsysop.loft.cast.cgm.model.impl.CgmPackageImpl#getCallTree()
	 * @generated
	 */
	int CALL_TREE = 4;

	/**
	 * The number of structural features of the '<em>Call Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_TREE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Call Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_TREE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.cast.cgm.model.api.CompilationSession <em>Compilation Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compilation Session</em>'.
	 * @see ru.arsysop.loft.cast.cgm.model.api.CompilationSession
	 * @generated
	 */
	EClass getCompilationSession();

	/**
	 * Returns the meta object for the reference '{@link ru.arsysop.loft.cast.cgm.model.api.CompilationSession#getTool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tool</em>'.
	 * @see ru.arsysop.loft.cast.cgm.model.api.CompilationSession#getTool()
	 * @see #getCompilationSession()
	 * @generated
	 */
	EReference getCompilationSession_Tool();

	/**
	 * Returns the meta object for the reference '{@link ru.arsysop.loft.cast.cgm.model.api.CompilationSession#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Options</em>'.
	 * @see ru.arsysop.loft.cast.cgm.model.api.CompilationSession#getOptions()
	 * @see #getCompilationSession()
	 * @generated
	 */
	EReference getCompilationSession_Options();

	/**
	 * Returns the meta object for the reference '{@link ru.arsysop.loft.cast.cgm.model.api.CompilationSession#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Index</em>'.
	 * @see ru.arsysop.loft.cast.cgm.model.api.CompilationSession#getIndex()
	 * @see #getCompilationSession()
	 * @generated
	 */
	EReference getCompilationSession_Index();

	/**
	 * Returns the meta object for the reference '{@link ru.arsysop.loft.cast.cgm.model.api.CompilationSession#getCalls <em>Calls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Calls</em>'.
	 * @see ru.arsysop.loft.cast.cgm.model.api.CompilationSession#getCalls()
	 * @see #getCompilationSession()
	 * @generated
	 */
	EReference getCompilationSession_Calls();

	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.cast.cgm.model.api.Tool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool</em>'.
	 * @see ru.arsysop.loft.cast.cgm.model.api.Tool
	 * @generated
	 */
	EClass getTool();

	/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.loft.cast.cgm.model.api.Tool#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ru.arsysop.loft.cast.cgm.model.api.Tool#getType()
	 * @see #getTool()
	 * @generated
	 */
	EAttribute getTool_Type();

	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.cast.cgm.model.api.Options <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Options</em>'.
	 * @see ru.arsysop.loft.cast.cgm.model.api.Options
	 * @generated
	 */
	EClass getOptions();

	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.cast.cgm.model.api.Index <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index</em>'.
	 * @see ru.arsysop.loft.cast.cgm.model.api.Index
	 * @generated
	 */
	EClass getIndex();

	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.cast.cgm.model.api.CallTree <em>Call Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Tree</em>'.
	 * @see ru.arsysop.loft.cast.cgm.model.api.CallTree
	 * @generated
	 */
	EClass getCallTree();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CgmFactory getCgmFactory();

} //CgmPackage
