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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ru.arsysop.loft.cast.decl.model.api.*;
import ru.arsysop.loft.cast.decl.model.meta.DeclFactory;
import ru.arsysop.loft.cast.decl.model.meta.DeclPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeclFactoryImpl extends EFactoryImpl implements DeclFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DeclFactory init() {
		try {
			DeclFactory theDeclFactory = (DeclFactory)EPackage.Registry.INSTANCE.getEFactory(DeclPackage.eNS_URI);
			if (theDeclFactory != null) {
				return theDeclFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DeclFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DeclPackage.TRANSLATION_UNIT_DECL: return createTranslationUnitDecl();
			case DeclPackage.NAMESPACE_DECL: return createNamespaceDecl();
			case DeclPackage.CLASS_TEMPLATE_DECL: return createClassTemplateDecl();
			case DeclPackage.CXX_METHOD_TEMPLATE_DECL: return createCxxMethodTemplateDecl();
			case DeclPackage.FUNCTION_DECL: return createFunctionDecl();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TranslationUnitDecl createTranslationUnitDecl() {
		TranslationUnitDeclImpl translationUnitDecl = new TranslationUnitDeclImpl();
		return translationUnitDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NamespaceDecl createNamespaceDecl() {
		NamespaceDeclImpl namespaceDecl = new NamespaceDeclImpl();
		return namespaceDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassTemplateDecl createClassTemplateDecl() {
		ClassTemplateDeclImpl classTemplateDecl = new ClassTemplateDeclImpl();
		return classTemplateDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CxxMethodTemplateDecl createCxxMethodTemplateDecl() {
		CxxMethodTemplateDeclImpl cxxMethodTemplateDecl = new CxxMethodTemplateDeclImpl();
		return cxxMethodTemplateDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionDecl createFunctionDecl() {
		FunctionDeclImpl functionDecl = new FunctionDeclImpl();
		return functionDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeclPackage getDeclPackage() {
		return (DeclPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DeclPackage getPackage() {
		return DeclPackage.eINSTANCE;
	}

} //CastFactoryImpl
