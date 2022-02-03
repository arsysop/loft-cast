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
package ru.arsysop.loft.cast.cgm.model.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ru.arsysop.loft.cast.cgm.model.api.CallTree;
import ru.arsysop.loft.cast.cgm.model.api.CompilationSession;
import ru.arsysop.loft.cast.cgm.model.api.Index;
import ru.arsysop.loft.cast.cgm.model.api.Options;
import ru.arsysop.loft.cast.cgm.model.api.Tool;

import ru.arsysop.loft.cast.cgm.model.meta.CgmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compilation Session</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.arsysop.loft.cast.cgm.model.impl.CompilationSessionImpl#getTool <em>Tool</em>}</li>
 *   <li>{@link ru.arsysop.loft.cast.cgm.model.impl.CompilationSessionImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link ru.arsysop.loft.cast.cgm.model.impl.CompilationSessionImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link ru.arsysop.loft.cast.cgm.model.impl.CompilationSessionImpl#getCalls <em>Calls</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompilationSessionImpl extends MinimalEObjectImpl.Container implements CompilationSession {
	/**
	 * The cached value of the '{@link #getTool() <em>Tool</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTool()
	 * @generated
	 * @ordered
	 */
	protected Tool tool;

	/**
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected Options options;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected Index index;

	/**
	 * The cached value of the '{@link #getCalls() <em>Calls</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalls()
	 * @generated
	 * @ordered
	 */
	protected CallTree calls;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompilationSessionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CgmPackage.eINSTANCE.getCompilationSession();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tool getTool() {
		if (tool != null && tool.eIsProxy()) {
			InternalEObject oldTool = (InternalEObject)tool;
			tool = (Tool)eResolveProxy(oldTool);
			if (tool != oldTool) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CgmPackage.COMPILATION_SESSION__TOOL, oldTool, tool));
			}
		}
		return tool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tool basicGetTool() {
		return tool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTool(Tool newTool) {
		Tool oldTool = tool;
		tool = newTool;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CgmPackage.COMPILATION_SESSION__TOOL, oldTool, tool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Options getOptions() {
		if (options != null && options.eIsProxy()) {
			InternalEObject oldOptions = (InternalEObject)options;
			options = (Options)eResolveProxy(oldOptions);
			if (options != oldOptions) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CgmPackage.COMPILATION_SESSION__OPTIONS, oldOptions, options));
			}
		}
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Options basicGetOptions() {
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOptions(Options newOptions) {
		Options oldOptions = options;
		options = newOptions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CgmPackage.COMPILATION_SESSION__OPTIONS, oldOptions, options));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Index getIndex() {
		if (index != null && index.eIsProxy()) {
			InternalEObject oldIndex = (InternalEObject)index;
			index = (Index)eResolveProxy(oldIndex);
			if (index != oldIndex) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CgmPackage.COMPILATION_SESSION__INDEX, oldIndex, index));
			}
		}
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Index basicGetIndex() {
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIndex(Index newIndex) {
		Index oldIndex = index;
		index = newIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CgmPackage.COMPILATION_SESSION__INDEX, oldIndex, index));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CallTree getCalls() {
		if (calls != null && calls.eIsProxy()) {
			InternalEObject oldCalls = (InternalEObject)calls;
			calls = (CallTree)eResolveProxy(oldCalls);
			if (calls != oldCalls) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CgmPackage.COMPILATION_SESSION__CALLS, oldCalls, calls));
			}
		}
		return calls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallTree basicGetCalls() {
		return calls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCalls(CallTree newCalls) {
		CallTree oldCalls = calls;
		calls = newCalls;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CgmPackage.COMPILATION_SESSION__CALLS, oldCalls, calls));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CgmPackage.COMPILATION_SESSION__TOOL:
				if (resolve) return getTool();
				return basicGetTool();
			case CgmPackage.COMPILATION_SESSION__OPTIONS:
				if (resolve) return getOptions();
				return basicGetOptions();
			case CgmPackage.COMPILATION_SESSION__INDEX:
				if (resolve) return getIndex();
				return basicGetIndex();
			case CgmPackage.COMPILATION_SESSION__CALLS:
				if (resolve) return getCalls();
				return basicGetCalls();
			default:
				return super.eGet(featureID, resolve, coreType);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CgmPackage.COMPILATION_SESSION__TOOL:
				setTool((Tool)newValue);
				return;
			case CgmPackage.COMPILATION_SESSION__OPTIONS:
				setOptions((Options)newValue);
				return;
			case CgmPackage.COMPILATION_SESSION__INDEX:
				setIndex((Index)newValue);
				return;
			case CgmPackage.COMPILATION_SESSION__CALLS:
				setCalls((CallTree)newValue);
				return;
			default:
				super.eSet(featureID, newValue);
				return;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CgmPackage.COMPILATION_SESSION__TOOL:
				setTool((Tool)null);
				return;
			case CgmPackage.COMPILATION_SESSION__OPTIONS:
				setOptions((Options)null);
				return;
			case CgmPackage.COMPILATION_SESSION__INDEX:
				setIndex((Index)null);
				return;
			case CgmPackage.COMPILATION_SESSION__CALLS:
				setCalls((CallTree)null);
				return;
			default:
				super.eUnset(featureID);
				return;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CgmPackage.COMPILATION_SESSION__TOOL:
				return tool != null;
			case CgmPackage.COMPILATION_SESSION__OPTIONS:
				return options != null;
			case CgmPackage.COMPILATION_SESSION__INDEX:
				return index != null;
			case CgmPackage.COMPILATION_SESSION__CALLS:
				return calls != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //CompilationSessionImpl
