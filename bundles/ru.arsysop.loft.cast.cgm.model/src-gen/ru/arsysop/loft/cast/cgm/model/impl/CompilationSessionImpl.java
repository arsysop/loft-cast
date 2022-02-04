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

import org.eclipse.emf.common.notify.NotificationChain;
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
	 * The cached value of the '{@link #getTool() <em>Tool</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTool()
	 * @generated
	 * @ordered
	 */
	protected Tool tool;

	/**
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected Options options;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected Index index;

	/**
	 * The cached value of the '{@link #getCalls() <em>Calls</em>}' containment reference.
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
		return tool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTool(Tool newTool, NotificationChain msgs) {
		Tool oldTool = tool;
		tool = newTool;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CgmPackage.COMPILATION_SESSION__TOOL, oldTool, newTool);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTool(Tool newTool) {
		if (newTool != tool) {
			NotificationChain msgs = null;
			if (tool != null)
				msgs = ((InternalEObject)tool).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CgmPackage.COMPILATION_SESSION__TOOL, null, msgs);
			if (newTool != null)
				msgs = ((InternalEObject)newTool).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CgmPackage.COMPILATION_SESSION__TOOL, null, msgs);
			msgs = basicSetTool(newTool, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CgmPackage.COMPILATION_SESSION__TOOL, newTool, newTool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Options getOptions() {
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOptions(Options newOptions, NotificationChain msgs) {
		Options oldOptions = options;
		options = newOptions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CgmPackage.COMPILATION_SESSION__OPTIONS, oldOptions, newOptions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOptions(Options newOptions) {
		if (newOptions != options) {
			NotificationChain msgs = null;
			if (options != null)
				msgs = ((InternalEObject)options).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CgmPackage.COMPILATION_SESSION__OPTIONS, null, msgs);
			if (newOptions != null)
				msgs = ((InternalEObject)newOptions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CgmPackage.COMPILATION_SESSION__OPTIONS, null, msgs);
			msgs = basicSetOptions(newOptions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CgmPackage.COMPILATION_SESSION__OPTIONS, newOptions, newOptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Index getIndex() {
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndex(Index newIndex, NotificationChain msgs) {
		Index oldIndex = index;
		index = newIndex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CgmPackage.COMPILATION_SESSION__INDEX, oldIndex, newIndex);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIndex(Index newIndex) {
		if (newIndex != index) {
			NotificationChain msgs = null;
			if (index != null)
				msgs = ((InternalEObject)index).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CgmPackage.COMPILATION_SESSION__INDEX, null, msgs);
			if (newIndex != null)
				msgs = ((InternalEObject)newIndex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CgmPackage.COMPILATION_SESSION__INDEX, null, msgs);
			msgs = basicSetIndex(newIndex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CgmPackage.COMPILATION_SESSION__INDEX, newIndex, newIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CallTree getCalls() {
		return calls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCalls(CallTree newCalls, NotificationChain msgs) {
		CallTree oldCalls = calls;
		calls = newCalls;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CgmPackage.COMPILATION_SESSION__CALLS, oldCalls, newCalls);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCalls(CallTree newCalls) {
		if (newCalls != calls) {
			NotificationChain msgs = null;
			if (calls != null)
				msgs = ((InternalEObject)calls).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CgmPackage.COMPILATION_SESSION__CALLS, null, msgs);
			if (newCalls != null)
				msgs = ((InternalEObject)newCalls).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CgmPackage.COMPILATION_SESSION__CALLS, null, msgs);
			msgs = basicSetCalls(newCalls, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CgmPackage.COMPILATION_SESSION__CALLS, newCalls, newCalls));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CgmPackage.COMPILATION_SESSION__TOOL:
				return basicSetTool(null, msgs);
			case CgmPackage.COMPILATION_SESSION__OPTIONS:
				return basicSetOptions(null, msgs);
			case CgmPackage.COMPILATION_SESSION__INDEX:
				return basicSetIndex(null, msgs);
			case CgmPackage.COMPILATION_SESSION__CALLS:
				return basicSetCalls(null, msgs);
			default:
				return super.eInverseRemove(otherEnd, featureID, msgs);
		}
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
				return getTool();
			case CgmPackage.COMPILATION_SESSION__OPTIONS:
				return getOptions();
			case CgmPackage.COMPILATION_SESSION__INDEX:
				return getIndex();
			case CgmPackage.COMPILATION_SESSION__CALLS:
				return getCalls();
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
