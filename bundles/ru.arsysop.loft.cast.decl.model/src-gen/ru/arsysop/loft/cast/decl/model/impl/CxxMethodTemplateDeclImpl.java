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
package ru.arsysop.loft.cast.decl.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import ru.arsysop.loft.cast.decl.model.api.ClassTemplateDecl;
import ru.arsysop.loft.cast.decl.model.api.CxxMethodTemplateDecl;

import ru.arsysop.loft.cast.decl.model.meta.DeclPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cxx Method Template Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.arsysop.loft.cast.decl.model.impl.CxxMethodTemplateDeclImpl#getClassTemplate <em>Class Template</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CxxMethodTemplateDeclImpl extends NamedDeclImpl implements CxxMethodTemplateDecl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CxxMethodTemplateDeclImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeclPackage.eINSTANCE.getCxxMethodTemplateDecl();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassTemplateDecl getClassTemplate() {
		if (eContainerFeatureID() != DeclPackage.CXX_METHOD_TEMPLATE_DECL__CLASS_TEMPLATE) return null;
		return (ClassTemplateDecl)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassTemplate(ClassTemplateDecl newClassTemplate, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newClassTemplate, DeclPackage.CXX_METHOD_TEMPLATE_DECL__CLASS_TEMPLATE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClassTemplate(ClassTemplateDecl newClassTemplate) {
		if (newClassTemplate != eInternalContainer() || (eContainerFeatureID() != DeclPackage.CXX_METHOD_TEMPLATE_DECL__CLASS_TEMPLATE && newClassTemplate != null)) {
			if (EcoreUtil.isAncestor(this, newClassTemplate))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newClassTemplate != null)
				msgs = ((InternalEObject)newClassTemplate).eInverseAdd(this, DeclPackage.CLASS_TEMPLATE_DECL__METHODS, ClassTemplateDecl.class, msgs);
			msgs = basicSetClassTemplate(newClassTemplate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclPackage.CXX_METHOD_TEMPLATE_DECL__CLASS_TEMPLATE, newClassTemplate, newClassTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DeclPackage.CXX_METHOD_TEMPLATE_DECL__CLASS_TEMPLATE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetClassTemplate((ClassTemplateDecl)otherEnd, msgs);
			default:
				return super.eInverseAdd(otherEnd, featureID, msgs);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DeclPackage.CXX_METHOD_TEMPLATE_DECL__CLASS_TEMPLATE:
				return basicSetClassTemplate(null, msgs);
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case DeclPackage.CXX_METHOD_TEMPLATE_DECL__CLASS_TEMPLATE:
				return eInternalContainer().eInverseRemove(this, DeclPackage.CLASS_TEMPLATE_DECL__METHODS, ClassTemplateDecl.class, msgs);
			default:
				return super.eBasicRemoveFromContainerFeature(msgs);
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
			case DeclPackage.CXX_METHOD_TEMPLATE_DECL__CLASS_TEMPLATE:
				return getClassTemplate();
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
			case DeclPackage.CXX_METHOD_TEMPLATE_DECL__CLASS_TEMPLATE:
				setClassTemplate((ClassTemplateDecl)newValue);
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
			case DeclPackage.CXX_METHOD_TEMPLATE_DECL__CLASS_TEMPLATE:
				setClassTemplate((ClassTemplateDecl)null);
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
			case DeclPackage.CXX_METHOD_TEMPLATE_DECL__CLASS_TEMPLATE:
				return getClassTemplate() != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //CxxMethodTemplateDeclImpl
