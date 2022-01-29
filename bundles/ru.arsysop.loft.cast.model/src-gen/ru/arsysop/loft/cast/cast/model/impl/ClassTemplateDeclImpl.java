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
package ru.arsysop.loft.cast.cast.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import ru.arsysop.loft.cast.cast.model.api.ClassTemplateDecl;
import ru.arsysop.loft.cast.cast.model.api.FunctionDecl;

import ru.arsysop.loft.cast.cast.model.meta.CastPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Template Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.arsysop.loft.cast.cast.model.impl.ClassTemplateDeclImpl#getMethods <em>Methods</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassTemplateDeclImpl extends NamedDeclImpl implements ClassTemplateDecl {
	/**
	 * The cached value of the '{@link #getMethods() <em>Methods</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionDecl> methods;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassTemplateDeclImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CastPackage.eINSTANCE.getClassTemplateDecl();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FunctionDecl> getMethods() {
		if (methods == null) {
			methods = new EObjectResolvingEList<FunctionDecl>(FunctionDecl.class, this, CastPackage.CLASS_TEMPLATE_DECL__METHODS);
		}
		return methods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CastPackage.CLASS_TEMPLATE_DECL__METHODS:
				return getMethods();
			default:
				return super.eGet(featureID, resolve, coreType);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CastPackage.CLASS_TEMPLATE_DECL__METHODS:
				getMethods().clear();
				getMethods().addAll((Collection<? extends FunctionDecl>)newValue);
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
			case CastPackage.CLASS_TEMPLATE_DECL__METHODS:
				getMethods().clear();
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
			case CastPackage.CLASS_TEMPLATE_DECL__METHODS:
				return methods != null && !methods.isEmpty();
			default:
				return super.eIsSet(featureID);
		}
	}

} //ClassTemplateDeclImpl
